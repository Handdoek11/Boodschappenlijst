package j$.util.concurrent;

import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37349c;

    public /* synthetic */ t(int i8, Object obj, Object obj2) {
        this.f37347a = i8;
        this.f37348b = obj;
        this.f37349c = obj2;
    }

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.f37347a = 2;
        this.f37349c = biFunction;
        this.f37348b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f37347a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        ((Consumer) this.f37348b).accept(obj);
        ((Consumer) this.f37349c).accept(obj);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f37348b).apply(((BiFunction) this.f37349c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f37347a) {
            case 0:
                break;
            default:
                ((BiConsumer) this.f37348b).accept(obj, obj2);
                ((BiConsumer) this.f37349c).accept(obj, obj2);
                return;
        }
        do {
            Object apply = ((BiFunction) this.f37349c).apply(obj, obj2);
            ConcurrentMap concurrentMap = (ConcurrentMap) this.f37348b;
            if (concurrentMap.replace(obj, obj2, apply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }
}
