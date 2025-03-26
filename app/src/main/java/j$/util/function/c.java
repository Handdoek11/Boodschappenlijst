package j$.util.function;

import java.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f37366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f37367c;

    public /* synthetic */ c(Function function, Function function2, int i8) {
        this.f37365a = i8;
        this.f37366b = function;
        this.f37367c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f37365a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f37365a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f37365a) {
            case 0:
                return this.f37367c.apply(this.f37366b.apply(obj));
            default:
                return this.f37366b.apply(this.f37367c.apply(obj));
        }
    }
}
