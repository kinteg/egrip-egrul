<template>
    <div>
        <Header/>
        <el-container>
            <router-view/>
        </el-container>
    </div>
</template>

<script>
    import Header from "../components/general/Header.vue";
    export default {
        name: "App",
        components: {Header},
    }
</script>

<style scoped>
    .el-container {
        padding: 20px;
        margin: auto;
        max-width: 950px;
        position: relative;
        display: block;
        -moz-box-sizing: border-box;
        box-sizing: border-box;
    }

    div {
        font-family: 'PdfIntextCondPro-Bold', sans-serif;
        font-size: 100% !important;
    }

</style>