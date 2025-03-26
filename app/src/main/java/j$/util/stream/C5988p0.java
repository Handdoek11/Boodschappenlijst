package j$.util.stream;

import java.util.function.Supplier;

/* renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5988p0 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC6017v0 f37763b;

    public /* synthetic */ C5988p0(EnumC6017v0 enumC6017v0, int i8) {
        this.f37762a = i8;
        this.f37763b = enumC6017v0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f37762a) {
            case 0:
                return new C6002s0(this.f37763b);
            case 1:
                return new C5997r0(this.f37763b);
            default:
                return new C6007t0(this.f37763b);
        }
    }
}
