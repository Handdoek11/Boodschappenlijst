package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum i0 {
    UNKNOWN_REQUEST(0, 100),
    NONE(1, 0),
    OVERVIEW(2, 1),
    REPARENT(3, 2),
    EDIT(4, 3),
    GET_LISTS(5, 4),
    EDIT_LISTS(6, 5),
    DESCRIBE_CLIENT(7, 6),
    BARCODE_LOOKUP(8, 7),
    UPLOAD_PHOTO(9, 8),
    ACCOUNT_LOOKUP(10, 9),
    RESET_PASSWORD(11, 10),
    SPEECH(12, 11),
    LOG_MESSAGE(13, 12),
    APP_STORE(14, 13),
    MAKE_INVITE(15, 14),
    DELETE_ACCOUNT(16, 15),
    RESET_CLIENT_ID(17, 16),
    EXPERIMENT(18, 17),
    RECOGNIZE_ITEM(19, 18);


    /* renamed from: M, reason: collision with root package name */
    private static h.a f43270M = new h.a() { // from class: s5.i0.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43280o;

    i0(int i8, int i9) {
        this.f43280o = i9;
    }

    public static i0 c(int i8) {
        if (i8 == 100) {
            return UNKNOWN_REQUEST;
        }
        switch (i8) {
            case 0:
                return NONE;
            case 1:
                return OVERVIEW;
            case 2:
                return REPARENT;
            case 3:
                return EDIT;
            case 4:
                return GET_LISTS;
            case 5:
                return EDIT_LISTS;
            case 6:
                return DESCRIBE_CLIENT;
            case 7:
                return BARCODE_LOOKUP;
            case 8:
                return UPLOAD_PHOTO;
            case 9:
                return ACCOUNT_LOOKUP;
            case 10:
                return RESET_PASSWORD;
            case 11:
                return SPEECH;
            case 12:
                return LOG_MESSAGE;
            case 13:
                return APP_STORE;
            case 14:
                return MAKE_INVITE;
            case 15:
                return DELETE_ACCOUNT;
            case 16:
                return RESET_CLIENT_ID;
            case 17:
                return EXPERIMENT;
            case 18:
                return RECOGNIZE_ITEM;
            default:
                return null;
        }
    }

    public final int e() {
        return this.f43280o;
    }
}
