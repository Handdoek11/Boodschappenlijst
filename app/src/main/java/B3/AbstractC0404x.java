package B3;

/* renamed from: B3.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0404x extends W2.a {
    public static String a(int i8) {
        switch (i8) {
            case 4000:
                return "TARGET_NODE_NOT_CONNECTED";
            case 4001:
                return "DUPLICATE_LISTENER";
            case 4002:
                return "UNKNOWN_LISTENER";
            case 4003:
                return "DATA_ITEM_TOO_LARGE";
            case 4004:
                return "INVALID_TARGET_NODE";
            case 4005:
                return "ASSET_UNAVAILABLE";
            case 4006:
                return "DUPLICATE_CAPABILITY";
            case 4007:
                return "UNKNOWN_CAPABILITY";
            case 4008:
                return "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
            case 4009:
                return "UNSUPPORTED_BY_TARGET";
            case 4010:
                return "ACCOUNT_KEY_CREATION_FAILED";
            case 4011:
            default:
                return W2.a.a(i8);
            case 4012:
                return "MIGRATION_NOT_CANCELLABLE";
            case 4013:
                return "NO_MIGRATION_FOUND_TO_CANCEL";
            case 4014:
                return "FEATURE_DISABLED";
            case 4015:
                return "WIFI_CONNECTION_FAILED";
        }
    }
}
