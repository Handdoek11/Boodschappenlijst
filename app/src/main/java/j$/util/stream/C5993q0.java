package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5993q0 extends AbstractC6012u0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ EnumC6017v0 f37772c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Predicate f37773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5993q0(EnumC6017v0 enumC6017v0, Predicate predicate) {
        super(enumC6017v0);
        this.f37772c = enumC6017v0;
        this.f37773d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f37795a) {
            return;
        }
        boolean test = this.f37773d.test(obj);
        EnumC6017v0 enumC6017v0 = this.f37772c;
        if (test == enumC6017v0.f37802a) {
            this.f37795a = true;
            this.f37796b = enumC6017v0.f37803b;
        }
    }
}
