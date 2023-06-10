<script lang="ts" setup>
import { reactive } from 'vue'
import { Edit, User, Upload } from '@element-plus/icons-vue'
// do not use same name with ref
const form = reactive({
    name: '',
    region: '',
    date1: '',
    date2: '',
    delivery: false,
    type: [],
    resource: '',
    desc: '',
})

const onSubmit = () => {
    console.log('submit!')
}

const goBack = () => {
    console.log('go back')
}
import { ref } from 'vue'

const active = ref(0)

const next = () => {
    if (active.value++ > 2) active.value = 0
}
</script>

<template>
  <div class="login-box">
      <el-page-header @back="goBack">
          <template #breadcrumb>
              <el-breadcrumb separator="/">
                  <el-breadcrumb-item :to="{ path: '/' }">
                      主页
                  </el-breadcrumb-item>
                  <el-breadcrumb-item :to="{ path: '/user' }">
                      用户中心
                  </el-breadcrumb-item>
                  <el-breadcrumb-item>
                      注册
                  </el-breadcrumb-item>
              </el-breadcrumb>
          </template>
          <template #content>
              <span class="text-large font-600 mr-3"> Title </span>
          </template>
      </el-page-header>
      <el-steps :active="active" finish-status="success" align-center>
          <el-step title="步骤一" :icon="User"/>
          <el-step title="Step 2" :icon="Edit"/>
          <el-step title="Step 3" />
      </el-steps>
      <el-form :model="form" label-width="60px" label-position="top" >
          <el-form-item label="用户名">
              <el-input v-model="form.name" />
          </el-form-item>
          <el-form-item label="密码">
              <el-input v-model="form.name" />
          </el-form-item>
          <el-form-item label="认证方式">
              <el-select v-model="form.region" placeholder="please select your zone">
                  <el-option label="Zone one" value="shanghai" />
                  <el-option label="Zone two" value="beijing" />
              </el-select>
          </el-form-item>
          <el-form-item label="Activity time">
              <el-col :span="11">
                  <el-date-picker
                          v-model="form.date1"
                          type="date"
                          placeholder="Pick a date"
                          style="width: 100%"
                  />
              </el-col>
              <el-col :span="2" class="text-center">
                  <span class="text-gray-500">-</span>
              </el-col>
              <el-col :span="11">
                  <el-time-picker
                          v-model="form.date2"
                          placeholder="Pick a time"
                          style="width: 100%"
                  />
              </el-col>
          </el-form-item>
          <el-form-item label="Instant delivery">
              <el-switch v-model="form.delivery" />
          </el-form-item>
          <el-form-item label="Activity type">
              <el-checkbox-group v-model="form.type">
                  <el-checkbox label="Online activities" name="type" />
                  <el-checkbox label="Promotion activities" name="type" />
                  <el-checkbox label="Offline activities" name="type" />
                  <el-checkbox label="Simple brand exposure" name="type" />
              </el-checkbox-group>
          </el-form-item>
          <el-form-item label="Resources">
              <el-radio-group v-model="form.resource">
                  <el-radio label="Sponsor" />
                  <el-radio label="Venue" />
              </el-radio-group>
          </el-form-item>
          <el-form-item label="Activity form">
              <el-input v-model="form.desc" type="textarea" />
          </el-form-item>
          <el-form-item>
              <el-button type="primary" @click="onSubmit">Create</el-button>
              <el-button>Cancel</el-button>
          </el-form-item>
      </el-form>
      <el-button style="margin-top: 12px" @click="next">Next step</el-button>
  </div>
</template>

