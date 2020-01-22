<template>
    <big-table :title="title" :name="name" :tableData="fillTableData()"/>
</template>

<script>
    import BigTable from "../../general/BigTable.vue";

    export default {
        name: "EconomicActivity",
        components: {BigTable},
        props: ['ipData'],

        data() {
            return {
                title: 'Вид экономической деятельности',
                name: 'EconomicActivity',
            }
        },

        methods: {
             fillTableData() {
                let tableData = [];
                for (let i = 0; i < this.ipData.length; i++) {
                    tableData[i] = [{
                        name: 'Вид деятельности',
                        item: (this.ipData[i].main === 1 ? 'О' : 'Не о') + 'сновной вид деятельности',
                    }, {
                        name: 'Код ОКВЭД:',
                        item: this.ipData[i].okved.codeOKVED,
                    }, {
                        name: 'Наименование вида деятельности:',
                        item: this.ipData[i].okved.name,
                    }]
                }
                return tableData;
            },
        },

    }
</script>

<style scoped>

</style>