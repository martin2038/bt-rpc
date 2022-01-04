
// GENERATED BY BTYX RPC GEN - LESS MODIFY BY HAND
// ${serviceFile} ${.now?iso_local}


import 'package:btrpc/btrpc.dart';
import '${dtoFile}';
export '${dtoFile}';

<#if service.description?has_content>
///  ${service.description}
</#if>
class ${service.name}Service extends BaseService {

	${service.name}Service(ClientChannel channel, ServiceConfig? config)
	  : super(channel, APP_NAME, '${service.name}', config);

<#list service.methods?filter(f->! f.hidden)  as m>
	${m.doc}
	Future<RpcResult<${m.dartRes()}>> ${m.name}(<#if m.arg??>${m.arg} req, </#if>{Map<String, String>? headers, Duration? timeout}) {
		   return call${m.customerInput?then('','0')}('${m.name}',<#if m.customerRes>${m.res.rawType.name}.fromJson,</#if> ${m.arg?has_content?then('req','null')},
	            headers: headers, timeout: timeout);
	}

</#list>

}

