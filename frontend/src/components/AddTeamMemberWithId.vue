<template>

    <v-card outlined>
        <v-card-title>
            AddTeamMemberWithId
        </v-card-title>

        <v-card-text>
            <Number label="ProjectId" v-model="value.projectId" :editMode="editMode"/>
            <Number label="MemberId" v-model="value.memberId" :editMode="editMode"/>
            <TeamRole offline label="Role" v-model="value.role" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="addTeamMemberWithId"
            >
                AddTeamMemberWithId
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>

export default {
    name: 'AddTeamMemberWithIdCommand',
    components:{
    },
    props: {},
    data: () => ({
        editMode: true,
        value: {},
    }),
    created() {
        this.value.projectId = 0;
        this.value.memberId = 0;
        this.value.role = {};
    },
    watch: {
    },
    methods: {
        addTeamMemberWithId() {
            this.$emit('addTeamMemberWithId', this.value);
        },
        close() {
            this.$emit('closeDialog');
        },
        change() {
            this.$emit("update:modelValue", this.value);
        },
    }
}
</script>

