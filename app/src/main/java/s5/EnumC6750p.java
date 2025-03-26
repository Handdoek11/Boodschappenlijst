package s5;

import com.google.protobuf.h;

/* renamed from: s5.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6750p {
    BARCODETYPE_UNKNOWN(0, 0),
    EAN_13(1, 1),
    EAN_8(2, 2),
    UPC_A(3, 3),
    UPC_E(4, 4),
    ITF_14(5, 5),
    CODE_128(6, 6);


    /* renamed from: z, reason: collision with root package name */
    private static h.a f43425z = new h.a() { // from class: s5.p.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43426o;

    EnumC6750p(int i8, int i9) {
        this.f43426o = i9;
    }

    public static EnumC6750p c(int i8) {
        switch (i8) {
            case 0:
                return BARCODETYPE_UNKNOWN;
            case 1:
                return EAN_13;
            case 2:
                return EAN_8;
            case 3:
                return UPC_A;
            case 4:
                return UPC_E;
            case 5:
                return ITF_14;
            case 6:
                return CODE_128;
            default:
                return null;
        }
    }

    public final int e() {
        return this.f43426o;
    }
}
