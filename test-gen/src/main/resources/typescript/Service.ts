/**
* GENERATED BY BTYX RPC GEN - LESS MODIFY BY HAND
* ${serviceFile}  ${.now?iso_local}
*/
<#assign pageDto = (service.customerDtos?seq_contains('PagedQuery')?string(",PagedQuery", ""))>
<#assign pageDto = pageDto+(service.customerDtos?seq_contains('PagedList')?string(",PagedList", ""))>
import {R,RpcService,Meta as M${pageDto}} from '@btyx/rpc-base';
<#-- ${(lang == 'Typescript')?then("'@btyx/rpc'","'../utils/rpc'")}; -->

<#assign dtos = service.customerDtos?filter(x -> x != 'PagedQuery' &&  x != 'PagedList') >

<#if dtos?has_content>
import {<#list dtos as f>${f}${f?has_next?then(',','')}</#list>} from './${dtoFile?replace(".ts","")}';
</#if>

<#if service.description?has_content>
///  ${service.description}
</#if>
export class ${service.name}Service{

	readonly s = "${service.name}/";

	constructor(readonly r: RpcService) {}
<#list service.methods?filter(f->! f.hidden)  as m>
	${m.doc}
	${m.name}(<#if m.arg??>d:${m.arg}, </#if>m?: M): R<${m.res}>{
		return this.r.async(this.s+"${m.name}",${m.arg?has_content?then('d','null')},m);
	}
</#list>

}
