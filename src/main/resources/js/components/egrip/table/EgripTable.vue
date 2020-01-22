<template>
    <el-collapse v-if="ipData != null">
        <general :ipData="ipData"/>
        <economic-activity v-if="ipData.okved != null" :ipData="ipData.okved"/>
        <changes v-if="ipData.gosReg != null" :ipData="ipData.gosReg"/>
        <tax-authority v-if="ipData.mns != null" :ipData="ipData.mns"/>
        <foms v-if="ipData.foms != null" :ipData="ipData.foms"/>
        <fss v-if="ipData.fss != null" :ipData="ipData.fss"/>
        <pf v-if="ipData.pf != null" :ipData="ipData.pf"/>
    </el-collapse>
</template>

<script>
    import {AXIOS} from "../../../AXIOS/http-common";
    import General from "./General.vue";
    import EconomicActivity from "./EconomicActivity.vue";
    import Changes from "./Changes.vue";
    import TaxAuthority from "./TaxAuthority.vue";
    import Foms from "./Foms.vue";
    import Fss from "./Fss.vue";
    import Pf from "./Pf.vue";

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