/** Created by anish on 15/12/16.
 *  This class represents the attraction information service, the interface to the other modules that
 *  like other service classes in other modules is responsible for injecting information into the
 *  information subspace and receiving information from it.
 */
package attraction_information_service;

import client.MainClient;

public class AttrInfoService {

    private AttrInfo attrinfo;
    private MainClient mainClient;

    public AttrInfoService(MainClient mainClient) throws AttrInfoInitializationException {
        try {
            attrinfo = new AttrInfo();
        }
        catch(Exception e) {
            throw new AttrInfoInitializationException(e);
        }

        this.mainClient = mainClient;
    }
}
