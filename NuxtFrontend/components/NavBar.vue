<template>
    <Wrapper :direction="direction" color="bg-gray-600" :width="14" class="mb-10 h-16 shadow-2xl">
        <template #left>
        </template>
        <template #center>
            <button class="text-blue-500"><NuxtLink to="/Map">Route Map</NuxtLink></button>
        </template>
        <template #right>
            <button class="text-blue-500"><NuxtLink to="/">Route Index</NuxtLink></button>
        </template>
    </Wrapper>
</template>

<script setup lang="ts">
import type { Direction } from '~/script/types';

const direction = ref<Direction>("horizontal")

</script>