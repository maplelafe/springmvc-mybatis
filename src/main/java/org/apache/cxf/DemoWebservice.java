package org.apache.cxf;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface DemoWebservice{
    public String queryBaseTx();
    
    public String queryBaseTxById(Integer id);
}
