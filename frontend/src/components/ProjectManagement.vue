<template>
    <div>
        <Number
            label="ProjectId"
            v-model="value.projectId"
            :editMode="editMode"
        />
        <String
            label="ProjectName"
            v-model="value.projectName"
            :editMode="editMode"
        />
        <String
            label="ProjectDescription"
            v-model="value.projectDescription"
            :editMode="editMode"
        />
        <ProjectStatus
            offline
            label="ProjectStatus"
            v-model="value.projectStatus"
            :editMode="editMode"
            @change="change"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'ProjectManagement',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "projectManagements",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
