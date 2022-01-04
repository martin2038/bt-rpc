
/// GENERATED BY BTYX RPC GEN - LESS MODIFY BY HAND
/// ${dtoFile} ${.now?iso_local}


import 'package:json_annotation/json_annotation.dart';

part '${dtoFile?replace(".dart",".g.dart")}';

const APP_NAME = '${app}';

<#list dtos as dto>
<#if dto.doc?has_content>/// ${dto.doc}</#if>
<#if dto.enum>
enum ${dto.typeName} {
	<#list dto.fields as f>
	${f.name}${f?has_next?then(',','')}
	</#list>
}
<#else>
<#if !dto.input>/// Server Response </#if>
@JsonSerializable(explicitToJson: true<#if dto.typeVar gt 0 >, genericArgumentFactories: true</#if>)
class ${dto.typeName} {

<#assign hasRequired = false>
<#list dto.fields?filter(f->! f.hidden) as f>
	<#list (f.annotations![])?filter(a->a.name?has_content) as anno>
	${anno.name}
	</#list>
	${(!f.required)?then('','final ')}${f.type}${(!f.required)?then('?','')} ${f.name};
	<#if f.required>
	<#assign hasRequired = true >
	</#if>

</#list>

<#if hasRequired>
	${dto.name}(<#list dto.fields?filter(f->f.required) as f>this.${f.name}${f?has_next?then(',','')}</#list>);
<#else>
	${dto.name}();
</#if>


	factory ${dto.name}.fromJson(Map<String, dynamic> json<#if dto.typeVar gt 0 >, ${dto.innerType} Function(Object? json) fromJsonT</#if>) =>
		_$${dto.name}FromJson(json<#if dto.typeVar gt 0 >, fromJsonT</#if>);

	Map<String, dynamic> toJson(<#if dto.typeVar gt 0 >Object Function(${dto.innerType} value) toJsonT</#if>) =>
		_$${dto.name}ToJson(this<#if dto.typeVar gt 0 >, toJsonT</#if>);

}
</#if>

</#list>