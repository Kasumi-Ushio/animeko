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

import me.him188.ani.datasources.bangumi.next.models.BangumiNextSlimPerson

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param appearEps 
 * @param person 
 * @param summary 
 */
@Serializable

data class BangumiNextSubjectPositionStaff (

    @SerialName(value = "appearEps") @Required val appearEps: kotlin.String,

    @SerialName(value = "person") @Required val person: BangumiNextSlimPerson,

    @SerialName(value = "summary") @Required val summary: kotlin.String

) {


}

