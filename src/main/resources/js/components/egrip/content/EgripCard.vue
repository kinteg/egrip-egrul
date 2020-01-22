<template>
    <div>
        <el-card v-for="ip in ipData" class="box-card"
                 :key="ip.id">
            <div slot="header">
                <router-link :to="'/egrip/' + ip.id"><span class="name">{{ip.name.surname}} {{ip.name.name}} {{ip.name.middleName}}</span></router-link>
            </div>
            <div class="text item" >
                <a>ОГРН: {{ip.ogrn}}, ИНН: {{ip.inn}}, Тип: {{ip.status.name}}, Гражданство: {{ip.citizen.oksm.name}}</a>
            </div>
        </el-card>
    </div>
</template>

<script>
    export default {
        name: "EgripCard",
        props: ['ipData']
    }
</script>

<style scoped>
    a {
        font-family: "Open Sans", sans-serif;
        font-size: 16px;
        text-decoration: none;
    }

    .item {
        margin-bottom: 18px;
    }

    .box-card {
        width: auto;
        margin: 10px;
    }

    .name {
        color: #1265a8;
        font-family: 'PdfIntextCondPro-Bold', monospace;
        font-size: 22px;
    }

    .el-card {
        overflow: auto;
    }
</style>