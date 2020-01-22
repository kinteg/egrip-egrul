<template>
    <big-table :title="title" :name="name" :tableData="fillTableData()"/>
</template>

<script>
    import BigTable from "../../general/BigTable.vue";

    export default {
        name: "Changes",
        components: {BigTable},
        props: ['ipData'],

        data() {
            return {
                title: 'Перечень изменений, внесённых в учредительские документы',
                name: 'Changes',
            }
        },

        methods: {
             fillTableData() {
                let tableData = [];
                for (let i = 0; i < this.ipData.length; i++) {
                    tableData[i] = [{
                        name: 'Дата внесения записи',
                        item: this.ipData[i].dtReg,
                    }, {
                        name: 'Регистрационный номер',
                        item: this.ipData[i].regNum,
                    }, {
                        name: 'Вид регистрации',
                        item: this.ipData[i].vidReg.name,
                    }, {
                        name: 'Наименование регистрирующего органа',
                        item: this.ipData[i].regOrg.name,
                    }]
                }
                return tableData;
            },
        },

    }
</script>

<style scoped>

</style>