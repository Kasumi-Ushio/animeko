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

import me.him188.ani.datasources.bangumi.next.models.BangumiNextCollectionType
import me.him188.ani.datasources.bangumi.next.models.BangumiNextReaction
import me.him188.ani.datasources.bangumi.next.models.BangumiNextSlimUser

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param comment 
 * @param id 
 * @param rate 
 * @param type 
 * @param updatedAt 
 * @param user 
 * @param reactions 
 */
@Serializable

data class BangumiNextSubjectInterestComment (

    @SerialName(value = "comment") @Required val comment: kotlin.String,

    @SerialName(value = "id") @Required val id: kotlin.Int,

    @SerialName(value = "rate") @Required val rate: kotlin.Int,

    @SerialName(value = "type") @Required val type: BangumiNextCollectionType,

    @SerialName(value = "updatedAt") @Required val updatedAt: kotlin.Int,

    @SerialName(value = "user") @Required val user: BangumiNextSlimUser,

    @SerialName(value = "reactions") val reactions: kotlin.collections.List<BangumiNextReaction>? = null

) {


}

