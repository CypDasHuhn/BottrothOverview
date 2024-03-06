<template>
    <div :class="`flex grow ${flexType} ${props.color} ${widthClass}`">
        <slot name="left"/>
        <div class="grow"/>
        <slot name="center"/>
        <div class="grow"/>
        <slot name="right"/>
    </div>
</template>

<script setup lang="ts">
import type { Direction } from '~/script/types';

const props = defineProps({
    direction: {
        type: String as () => Direction,
        required: true
    },
    color: {type: String, default: ''},
    width: {type: Number, default: 10},
})

const flexType = computed(() => {
    return props.direction == "horizontal" ?
        "flex-row" : 
        "flex-col"
})

const widthClass = computed(() => {
    let s = props.direction == "horizontal" ?
        `h-${props.width}` :
        `w-${props.width}`
    return s
})

</script>