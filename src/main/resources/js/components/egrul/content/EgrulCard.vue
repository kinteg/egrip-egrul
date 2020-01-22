<template>
    <div>
        <el-card v-for="ul in ulData" class="box-card"
                 :key="ul.id">
            <div slot="header">
                <router-link :to="'/egrul/' + ul.id"><span class="name">{{ul.name.fullName}}</span></router-link>
            </div>
            <div class="text item" >
                <a>ОГРН: {{ul.ogrn}}, ИНН: {{ul.inn}}</a><a v-if="ul.adr.telefon !== ''">, Телефон: {{ul.adr.telefon}} </a>
            </div>
        </el-card>
    </div>
</template>

<script>
    export default {
        name: "EgrulCard",
        props: ['ulData']
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