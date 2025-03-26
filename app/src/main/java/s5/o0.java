package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum o0 {
    RS_UNKNOWN_ERROR(0, 100),
    RS_SUCCESS(1, 0),
    RS_TRANSPORT_ERROR(2, 1),
    RS_REQUEST_SERIALIZATION_FAILED(3, 2),
    RS_RESPONSE_PARSING_FAILED(4, 3),
    RS_REQUEST_CANCELLED(5, 4),
    RS_INVALID_REQUEST(6, 5),
    RS_INTERNAL_SERVER_ERROR(7, 6);


    /* renamed from: A, reason: collision with root package name */
    private static h.a f43406A = new h.a() { // from class: s5.o0.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43416o;

    o0(int i8, int i9) {
        this.f43416o = i9;
    }

    public static o0 c(int i8) {
        if (i8 == 100) {
            return RS_UNKNOWN_ERROR;
        }
        switch (i8) {
            case 0:
                return RS_SUCCESS;
            case 1:
                return RS_TRANSPORT_ERROR;
            case 2:
                return RS_REQUEST_SERIALIZATION_FAILED;
            case 3:
                return RS_RESPONSE_PARSING_FAILED;
            case 4:
                return RS_REQUEST_CANCELLED;
            case 5:
                return RS_INVALID_REQUEST;
            case 6:
                return RS_INTERNAL_SERVER_ERROR;
            default:
                return null;
        }
    }

    public final int e() {
        return this.f43416o;
    }
}
