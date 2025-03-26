package k7;

import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;
import y6.AbstractC6980h;

/* loaded from: classes2.dex */
public final class G implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f38609a;

    /* renamed from: b, reason: collision with root package name */
    private i7.f f38610b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6928j f38611c;

    static final class a extends J6.s implements I6.a {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f38613s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f38613s = str;
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i7.f invoke() {
            i7.f fVar = G.this.f38610b;
            return fVar == null ? G.this.c(this.f38613s) : fVar;
        }
    }

    public G(String str, Enum[] enumArr) {
        J6.r.e(str, "serialName");
        J6.r.e(enumArr, "values");
        this.f38609a = enumArr;
        this.f38611c = AbstractC6929k.a(new a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i7.f c(String str) {
        F f8 = new F(str, this.f38609a.length);
        for (Enum r02 : this.f38609a) {
            C6151s0.o(f8, r02.name(), false, 2, null);
        }
        return f8;
    }

    @Override // g7.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        int B7 = eVar.B(getDescriptor());
        if (B7 >= 0) {
            Enum[] enumArr = this.f38609a;
            if (B7 < enumArr.length) {
                return enumArr[B7];
            }
        }
        throw new SerializationException(B7 + " is not among valid " + getDescriptor().a() + " enum values, values size is " + this.f38609a.length);
    }

    @Override // g7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(j7.f fVar, Enum r42) {
        J6.r.e(fVar, "encoder");
        J6.r.e(r42, "value");
        int D7 = AbstractC6980h.D(this.f38609a, r42);
        if (D7 != -1) {
            fVar.k(getDescriptor(), D7);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r42);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().a());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(this.f38609a);
        J6.r.d(arrays, "toString(this)");
        sb.append(arrays);
        throw new SerializationException(sb.toString());
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return (i7.f) this.f38611c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}
