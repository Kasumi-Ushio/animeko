/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package me.him188.ani.datasources.bangumi.next.models

import me.him188.ani.datasources.bangumi.next.models.BangumiNextSimpleUser

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param users 
 * @param `value` 
 */
@Serializable

data class BangumiNextReaction (

    @SerialName(value = "users") @Required val users: kotlin.collections.List<BangumiNextSimpleUser>,

    @SerialName(value = "value") @Required val `value`: kotlin.Int

) {


}

