package j$.util.stream;

import j$.util.function.BiFunction$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6001s implements BinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f37783b;

    public /* synthetic */ C6001s(BiConsumer biConsumer, int i8) {
        this.f37782a = i8;
        this.f37783b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f37782a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f37782a) {
            case 0:
                this.f37783b.accept(obj, obj2);
                break;
            case 1:
                this.f37783b.accept(obj, obj2);
                break;
            default:
                this.f37783b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
