<template>
    <el-collapse v-if="ipData != null">
        <general :ipData="ipData"/>
        <economic-activity v-if="ipData.okved.length !== 0" :ipData="ipData.okved"/>
        <changes v-if="ipData.gosReg.length !== 0" :ipData="ipData.gosReg"/>
        <tax-authority v-if="ipData.mns != null" :ipData="ipData.mns"/>
        <foms v-if="ipData.foms != null" :ipData="ipData.foms"/>
        <fss v-if="ipData.fss != null" :ipData="ipData.fss"/>
        <pf v-if="ipData.pf != null" :ipData="ipData.pf"/>
    </el-collapse>
</template>

<script>
    import {AXIOS} from "../../../AXIOS/http-common";
    import General from "./components/General.vue";
    import EconomicActivity from "./components/EconomicActivity.vue";
    import Changes from "./components/Changes.vue";
    import TaxAuthority from "./components/TaxAuthority.vue";
    import Foms from "./components/Foms.vue";
    import Fss from "./components/Fss.vue";
    import Pf from "./components/Pf.vue";

    export default {
        name: "EgripTable",
        components: {Pf, Fss, Foms, TaxAuthority, Changes, EconomicActivity, General},
        data() {
            return {
                ipData: null
            }
        },

        methods: {

            loadData() {

                AXIOS.get('egrip/' + this.$route.params.id)
                    .then(response => {
                        this.ipData = response.data;
                        if (this.ipData === '') {
                            this.$router.push("/egrip");
                        }
                    })
                    .catch(error => {
                        console.log('ERROR: ' + error);
                    })
            }

        },

        mounted() {
            this.loadData();
        }
    }
</script>

<style scoped>

</style>