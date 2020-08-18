package ltd.v2.v2survey.network;

import android.os.Handler;

import io.reactivex.Observable;
import ltd.v2.v2survey.model.Survey;
import retrofit2.Response;
import retrofit2.Retrofit;


public class NetworkService {

    private NetworkCall networkCall = null;
    private NetworkCall networkCallAuth = null;
    private Handler handler;
    public static int SUCCESS = 1;
    public static int FAILED = 0;

    public NetworkService() {
        Retrofit retrofit = RestClient.getClient();
        networkCall = retrofit.create(NetworkCall.class);
    }

    public Observable<Response<Survey[]>> GetSurvey() {
       return networkCall.GetSurvey();
    }

    //region GET METHODS
//    public Observable<Response<JSONObject>> UserLogin(String userName, String email, String password) {
//        return networkCall.UserLogin(userName, email, password);
//    }
//
//    public Observable<Response<UserBasic>> Login(String userName, String email, String password) {
//        return networkCall.Login(userName, email, password);
//    }
//
//    public Observable<Response<UserBasic>> UserSignup(String userName, String email, String password) {
//        return networkCall.UserSignup(userName, email, password, password);
//    }
//
//    public Observable<Response<JSONObject>> VendorSignup(String userName, String shopName, String email, String postalCode, String phone, String address) {
//        return networkCall.VendorSignup(userName, shopName, email, postalCode, phone, address);
//    }
//
//    public Observable<Response<Products[]>> GetProducts(){
//        return networkCall.GetProducts();
//    }
//
//    public Observable<Response<Products[]>> GetBrandProducts(int id) {
//        return networkCall.GetBrandProducts(id);
//    }
//    public Observable<Response<Products[]>> GetCategoryProducts(int id) {
//        return networkCall.GetCategoryProducts(id);
//    }
//
//    public Observable<Response<Brands[]>> GetBrands(){
//        return networkCall.GetBrand();
//    }
//
//    public Observable<Response<Category[]>> GetCategories() {
//        return networkCall.GetCategories();
//    }
//
//    public Observable<Response<JSONObject>> AddCartItem(String mToken, int mProductId, int mCartId, int mQuantity) {
//        return networkCall.AddCartItem( mToken,mProductId, mCartId, mQuantity);
//    }
//
//    public Observable<Response<Carts>> AddNewCart(String mToken, int mTotal, int mSubTotal) {
//        return networkCall.AddNewCart(mToken,mTotal, mSubTotal);
//    }
//    public Observable<Response<Carts[]>> GetCart(String mToken) {
//        return networkCall.GetCart( mToken);
//    }
//    public Observable<Response<Carts>> UpdateCart(String mToken, int mCartId, List<UpdateCart> mUpdateCart){
//        return networkCall.UpdateCart(mToken, mCartId, mUpdateCart);
//    }
//    public Observable<Response<CartItem[]>> RemoveCartItem(String mToken, int cartId) {
//        return networkCall.RemoveCartItem( mToken, cartId);
//    }
//    public Observable<Response<Orders>> PlaceOrder(String mToken, String mCustomer, String mMessage, String mAddress, String mAddressType, String mAddressLabel, String mPhoneNum) {
//        return networkCall.PlaceOrder(mToken, mCustomer, mMessage, mAddress, mAddressType, mAddressLabel, mPhoneNum);
//    }
//    public Observable<Response<OrderItem[]>> GetOrderItem(String mToken) {
//        return networkCall.GetOrderItem(mToken);
//    }
//    public Observable<Response<UserProfile>> CreateProfile(String mToken, RequestBody mFullName,
//                                                           int phoneNumber, RequestBody mCity,
//                                                           RequestBody mStreet, RequestBody mHouse,
//                                                           RequestBody mApartment, RequestBody mZipCode,
//                                                           MultipartBody.Part mProfilePic) {
//        return networkCall.CreateProfile(mToken, mFullName, phoneNumber, mCity, mStreet, mHouse, mApartment, mZipCode, mProfilePic);
//    }
//    public Observable<Response<UserProfile>> UpdateProfile(String mToken, RequestBody mFullName,
//                                                             long phoneNumber, RequestBody mCity,
//                                                             RequestBody mStreet, RequestBody mHouse,
//                                                             RequestBody mApartment, RequestBody mZipCode,
//                                                             MultipartBody.Part mProfilePic) {
//        return networkCall.UpdateProfile(mToken, mFullName, phoneNumber, mCity, mStreet, mHouse, mApartment, mZipCode, mProfilePic);
//    }
//    public Observable<Response<UserInfo[]>> GetUserInfo(String mToken) {
//        return networkCall.GetUserInfo( mToken);
//    }






//    public Observable<Response<String>> GetDSRBasicInfos(String contactNo, String password, int srID, int systemID) {
//        return networkCall.GetDSRBasicInfos(contactNo, password, srID, systemID);
//    }
//
//    public Observable<Response<String>> GetSKUs(String userID, String password, int systemID, int deliveryGroupID) {
//        return networkCall.GetSKUs(userID, password, systemID, deliveryGroupID);
//    }
//
//    public Observable<Response<String>> GetSections(String userID, String password, int srID, int systemID) {
//        return networkCall.GetSections(userID, password, srID, systemID);
//    }
//
//    public Observable<Response<String>> GetOutletInfos(String userID, String password, int srID, int systemID) {
//        return networkCall.GetOutletInfos(userID, password, srID, systemID);
//    }
//
//    //region Promotion
//    public Observable<Response<String>> GetSalesPromotions(String userID, String password, int systemID, String operationDate) {
//        return networkCall.GetSalesPromotions(userID, password, systemID, operationDate);
//    }
//
//    public Observable<Response<String>> GetSPSKUChannel(String userID, String password, int systemID, String operationDate) {
//        return networkCall.GetSPSKUChannel(userID, password, systemID, operationDate);
//    }
//
//    public Observable<Response<String>> GetSPSlabs(String userID, String password, int systemID, String operationDate) {
//        return networkCall.GetSPSlabs(userID, password, systemID, operationDate);
//    }
//
//    public Observable<Response<String>> GetSPBonuses(String userID, String password, int systemID, String operationDate) {
//        return networkCall.GetSPBonuses(userID, password, systemID, operationDate);
//    }
//
//    public Observable<Response<String>> GetPromotionalInfo(String userID, String password, int srID, int systemID) {
//        return networkCall.GetPromotionalInfo(userID, password, srID, systemID);
//    }
    //endregion


    //endregion

    //region POST METHODS
//    public Observable<BijoyTransactionResponse> UploadBijoyInformation(JSONObject uploadData) {
//        return networkCall.ChallanUploadByCM(uploadData);
//    }
//
//    public Observable<BijoyTransactionResponse> ChallanConfirmation(JSONObject uploadData) {
//        return networkCall.ChallanConfirmByCM(uploadData);
//    }

    //endregion


}
