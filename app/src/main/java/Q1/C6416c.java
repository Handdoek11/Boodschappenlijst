package q1;

import com.adadapted.android.sdk.core.device.DeviceInfo;
import j$.util.Objects;

/* renamed from: q1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6416c {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6417d[] f40927a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40928b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f40929c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40930d;

    public C6416c(String str, AbstractC6417d[] abstractC6417dArr) {
        this.f40928b = str;
        this.f40929c = null;
        this.f40927a = abstractC6417dArr;
        this.f40930d = 0;
    }

    private void a(int i8) {
        if (i8 == this.f40930d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f40930d) + " expected, but got " + c(i8));
    }

    private String c(int i8) {
        return i8 != 0 ? i8 != 1 ? DeviceInfo.UNKNOWN_VALUE : "ArrayBuffer" : "String";
    }

    public String b() {
        a(0);
        return this.f40928b;
    }

    public C6416c(byte[] bArr, AbstractC6417d[] abstractC6417dArr) {
        Objects.requireNonNull(bArr);
        this.f40929c = bArr;
        this.f40928b = null;
        this.f40927a = abstractC6417dArr;
        this.f40930d = 1;
    }
}
