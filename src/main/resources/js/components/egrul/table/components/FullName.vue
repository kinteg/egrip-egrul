<template>
    <big-table :title="title" :name="name" :tableData="fillTableData()"/>
</template>

<script>

    import BigTable from "../../../general/BigTable.vue";
    export default {
        name: "FullName",
        components: {BigTable},
        props: ['ulData'],
        
        data() {
            return {
                title: 'ФИО руководителей',
                name: 'FullName',
            }
        },

        methods: {
            fillTableData() {
                let tableData = [];
                for (let i = 0; i < this.ulData.length; i++) {
                    tableData[i] = [{
                        name: 'Фамилия',
                        item: this.ulData[i].fullName.surname,
                    }, {
                        name: 'Имя',
                        item: this.ulData[i].fullName.name,
                    }, {
                        name: 'Отчество',
                        item: this.ulData[i].fullName.middleName,
                    }, {
                        name: 'Должность',
                        item: this.ulData[i].dolgn,
                    }]
                }
                return tableData;
            },
        },

    }



</script>

<style scoped>

</style>