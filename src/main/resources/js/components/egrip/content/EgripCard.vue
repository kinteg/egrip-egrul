<template>
    <div>
        <el-card v-for="ip in ipData" class="box-card"
                 :key="ip.id">
            <div slot="header">
                <router-link :to="'/egrip/' + ip.id" class="card-title">
                    <span v-if="ip.status.id === 0" style="color: #1265a8">
                        {{ip.name.surname}} {{ip.name.name}} {{ip.name.middleName}}
                    </span>
                    <span v-else style="color: #ff0006">
                        {{ip.name.surname}} {{ip.name.name}} {{ip.name.middleName}} (Прекратил{{ip.name.sex === 1 ? '' : 'а'}} деятельность)
                    </span>
                </router-link>
            </div>
            <div class="text item" >
                <a>ОГРН: {{ip.ogrn}}, ИНН: {{ip.inn}}, Гражданство: {{ip.citizen.oksm.name}}</a>
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
    .card-title {
        text-decoration: none;
    }

    .item {
        margin-bottom: 18px;
    }

    .box-card {
        width: auto;
        margin: 10px;
    }

    .el-card {
        overflow: auto;
    }
</style>