// package duke.choice;
//
// import io.helidon.common.http.Http;
// import io.helidon.webserver.Handler;
// import io.helidon.webserver.ServerRequest;
// import io.helidon.webserver.ServerResponse;
//
// import java.util.ArrayList;
// import java.util.function.BiConsumer;
//
// public class Itemlist  implements Handler {
//     private ArrayList<Clothes>items;
//
//     public Itemlist(ArrayList<Clothes> items) {
//         this.items = items;
//     }
//
//     public ArrayList<Clothes> getItems() {
//         return items;
//     }
//
//     public void setItems(ArrayList<Clothes> items) {
//         this.items = items;
//     }
//
//     @Override
//     public void accept(ServerRequest serverRequest, ServerResponse serverResponse) {
//         serverResponse.status(Http.Status.OK_200);
//         serverResponse.headers().put("Content Type","text/plain: charset=UTF-8");
//         StringBuilder result = new StringBuilder();
//         for (Clothes i: items){
//             result.append(i+"/n");
//
//
//         }
//         serverResponse.send(result);
//     }
// }
