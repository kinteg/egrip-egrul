<template>
    <custom-table :title="title" :name="name" :tableData="tableData"/>
</template>

<script>

    import CustomTable from "../../../general/Table.vue";
    export default {
        name: "General",
        components: {CustomTable},
        props: ['ipData'],
        
        data() {
            return {
                title: 'Общие',
                name: 'General',
                tableData: [{
                    name: 'Фамилия',
                    item: this.ipData.name.surname,
                }, {
                    name: 'Имя',
                    item: this.ipData.name.name,
                }, {
                    name: 'Отчество',
                    item: this.ipData.name.middleName,
                }, {
                    name: 'Пол',
                    item: this.ipData.name.sex === 1 ? 'мужской' : 'женский',
                }, {
                    name: 'ОГРН',
                    item: this.ipData.ogrn,
                }, {
                    name: 'ИНН',
                    item: this.ipData.inn,
                }, {
                    name: 'Гражданство',
                    item: this.ipData.citizen.vidCitizen.name,
                }, {
                    name: 'Страна',
                    item: this.ipData.citizen.oksm.name,
                }, {
                    name: 'Текущий регистрирующий орган:',
                    item: this.ipData.regOrg.name,
                }, {
                    name: 'Дата внесения записи:',
                    item: this.ipData.gosReg[0].dtReg,
                }, {
                    name: 'Статус:',
                    item: this.ipData.status.name,
                }]

            }
        },

    }

</script>

<style scoped>

</style>