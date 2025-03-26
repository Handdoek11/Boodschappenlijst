package j$.util.stream;

import j$.util.Map;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5967l implements BiConsumer, Supplier, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37735c;

    public /* synthetic */ C5967l(int i8, Object obj, Object obj2) {
        this.f37733a = i8;
        this.f37734b = obj;
        this.f37735c = obj2;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f37733a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C5993q0((EnumC6017v0) this.f37734b, (Predicate) this.f37735c);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        Set set = Collectors.f37439a;
        Object apply = ((Function) this.f37734b).apply(obj2);
        Object requireNonNull = Objects.requireNonNull(((Function) this.f37735c).apply(obj2));
        Object b8 = Map.EL.b((java.util.Map) obj, apply, requireNonNull);
        if (b8 != null) {
            throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", apply, b8, requireNonNull));
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f37733a) {
            case 2:
                ((C5976m3) this.f37734b).b((Consumer) this.f37735c, obj);
                break;
            case 3:
                if (obj != null) {
                    ((ConcurrentHashMap) this.f37735c).putIfAbsent(obj, Boolean.TRUE);
                    break;
                } else {
                    ((AtomicBoolean) this.f37734b).set(true);
                    break;
                }
            default:
                ((BiConsumer) this.f37734b).accept(this.f37735c, obj);
                break;
        }
    }
}
