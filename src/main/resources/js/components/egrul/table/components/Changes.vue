<template>
    <big-table :title="title" :name="name" :tableData="fillTableData()"/>
</template>

<script>
    import BigTable from "../../../general/BigTable.vue";

    export default {
        name: "Changes",
        components: {BigTable},
        props: ['ulData'],

        data() {
            return {
                title: 'Перечень изменений, внесённых в учредительные документы',
                name: 'Changes',
            }
        },

        methods: {
             fillTableData() {
                let tableData = [];
                for (let i = 0; i < this.ulData.length; i++) {
                    tableData[i] = [{
                        name: 'Дата регистрации',
                        item: this.ulData[i].dtReg,
                    }, {
                        name: 'Рег. №:',
                        item: this.ulData[i].regNum,
                    }, {
                        name: 'Вид регистрации:',
                        item: this.ulData[i].vidReg.name,
                    }, {
                        name: 'Наименование регистрирующего органа:',
                        item: this.ulData[i].regOrg.name,
                    }]
                }
                return tableData;
            },
        },

    }
</script>

<style scoped>

</style>