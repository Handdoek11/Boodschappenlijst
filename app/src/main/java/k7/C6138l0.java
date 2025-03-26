package k7;

import i7.k;
import java.util.List;
import kotlinx.serialization.SerializationException;
import x6.AbstractC6929k;
import x6.C6916E;
import x6.EnumC6932n;
import x6.InterfaceC6928j;
import y6.AbstractC6987o;

/* renamed from: k7.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6138l0 implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38702a;

    /* renamed from: b, reason: collision with root package name */
    private List f38703b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6928j f38704c;

    /* renamed from: k7.l0$a */
    static final class a extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f38705o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ C6138l0 f38706s;

        /* renamed from: k7.l0$a$a, reason: collision with other inner class name */
        static final class C0285a extends J6.s implements I6.l {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ C6138l0 f38707o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0285a(C6138l0 c6138l0) {
                super(1);
                this.f38707o = c6138l0;
            }

            public final void b(i7.a aVar) {
                J6.r.e(aVar, "$this$buildSerialDescriptor");
                aVar.h(this.f38707o.f38703b);
            }

            @Override // I6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((i7.a) obj);
                return C6916E.f44463a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, C6138l0 c6138l0) {
            super(0);
            this.f38705o = str;
            this.f38706s = c6138l0;
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i7.f invoke() {
            return i7.i.c(this.f38705o, k.d.f36739a, new i7.f[0], new C0285a(this.f38706s));
        }
    }

    public C6138l0(String str, Object obj) {
        J6.r.e(str, "serialName");
        J6.r.e(obj, "objectInstance");
        this.f38702a = obj;
        this.f38703b = AbstractC6987o.e();
        this.f38704c = AbstractC6929k.b(EnumC6932n.f44481s, new a(str, this));
    }

    @Override // g7.a
    public Object deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        i7.f descriptor = getDescriptor();
        j7.c d8 = eVar.d(descriptor);
        int e8 = d8.e(getDescriptor());
        if (e8 == -1) {
            C6916E c6916e = C6916E.f44463a;
            d8.c(descriptor);
            return this.f38702a;
        }
        throw new SerializationException("Unexpected index " + e8);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return (i7.f) this.f38704c.getValue();
    }

    @Override // g7.h
    public void serialize(j7.f fVar, Object obj) {
        J6.r.e(fVar, "encoder");
        J6.r.e(obj, "value");
        fVar.d(getDescriptor()).c(getDescriptor());
    }
}
