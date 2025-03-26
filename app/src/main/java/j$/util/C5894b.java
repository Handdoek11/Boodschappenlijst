package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5894b implements Comparator, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37278b;

    public /* synthetic */ C5894b(int i8, Object obj) {
        this.f37277a = i8;
        this.f37278b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f37277a) {
            case 0:
                ToIntFunction toIntFunction = (ToIntFunction) this.f37278b;
                return Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            case 1:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) this.f37278b;
                return Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 2:
                Function function = (Function) this.f37278b;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
            default:
                ToLongFunction toLongFunction = (ToLongFunction) this.f37278b;
                return Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
        }
    }
}
