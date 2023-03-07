<template>
  <van-nav-bar
      title="标题"
      left-arrow
      @click-left="onClickLeft"
  >
    <template #right>
      <van-icon name="search" size="18"/>
    </template>
  </van-nav-bar>

  <div id="content">
    <template v-if="active === 'index'">
      <Index />
    </template>
    <template v-if="active === 'team'">
      <Team />
    </template>
  </div>

  <van-tabbar v-model="active" @change="onChange">
    <van-tabbar-item icon="home-o" name="index">主页</van-tabbar-item>
<!--    <van-tabbar-item icon="search">搜索</van-tabbar-item>-->
    <van-tabbar-item icon="friends-o" name="team">队伍</van-tabbar-item>
    <van-tabbar-item icon="setting-o" name="user">我的</van-tabbar-item>
  </van-tabbar>
</template>

<script setup>
import {ref} from "vue";
import {showToast} from "vant";
import Index from "../views/Index.vue";
import Team from "../views/Team.vue";

const onClickLeft = () => alert("sad");

const active = ref("index");
const onChange = (index) => showToast(`标签 ${index}`);

</script>

<style>

</style>