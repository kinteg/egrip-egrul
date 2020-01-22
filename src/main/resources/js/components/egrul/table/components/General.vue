<template>
    <custom-table :title="title" :name="name" :tableData="tableData"/>
</template>

<script>

    import CustomTable from "../../../general/Table.vue";
    export default {
        name: "General",
        components: {CustomTable},
        props: ['ulData'],
        
        data() {
            return {
                title: 'Общие',
                name: 'General',
                tableData: [{
                    name: 'Краткое наименование',
                    item: this.ulData.name.name,
                }, {
                    name: 'Наименование на иностранном языке',
                    item: this.ulData.name.engName,
                }, {
                    name: 'Иностранный язык',
                    item: this.ulData.name.lang == null ? '' : this.ulData.name.lang.name,
                }, {
                    name: 'Орг.- правовая форма',
                    item: this.ulData.name.opf.name,
                }, {
                    name: 'Адрес (место нахождения) постоянно действующего испольнительного органа юридического лица',
                    item: this.ulData.adr.address,
                }, {
                    name: 'Индекс',
                    item: this.ulData.adr.index,
                }, {
                    name: 'Телефон',
                    item: this.ulData.adr.telefon,
                }, {
                    name: 'Факс',
                    item: this.ulData.adr.fax,
                }, {
                    name: 'ОКАТО',
                    item: this.ulData.adr.okato,
                }, {
                    name: 'ОГРН',
                    item: this.ulData.ogrn,
                }, {
                    name: 'ИНН',
                    item: this.ulData.inn,
                }, {
                    name: 'КПП',
                    item: this.ulData.kpp,
                }, {
                    name: 'Наименование регистрирующего органа',
                    item: this.ulData.regorg.name,
                }, {
                    name: 'Способ образования оридического лица',
                    item: this.ulData.vidreg.name,
                }, {
                    name: 'Дата регистрации',
                    item: this.ulData.dtregstart,
                }, {
                    name: 'Размер капитала (руб.)',
                    item: this.ulData.capital.summa,
                }, {
                    name: 'Тип',
                    item: this.ulData.capital.vidCap.name,
                }]

            }
        },

    }



</script>

<style scoped>

</style>