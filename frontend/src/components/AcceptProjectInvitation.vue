<template>

    <v-card outlined>
        <v-card-title>
            AcceptProjectInvitation
        </v-card-title>

        <v-card-text>
            <Number label="ProjectId" v-model="value.projectId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="acceptProjectInvitation"
            >
                AcceptProjectInvitation
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
    name: 'AcceptProjectInvitationCommand',
    components:{
    },
    props: {},
    data: () => ({
        editMode: true,
        value: {},
    }),
    created() {
        this.value.projectId = 0;
    },
    watch: {
    },
    methods: {
        acceptProjectInvitation() {
            this.$emit('acceptProjectInvitation', this.value);
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

