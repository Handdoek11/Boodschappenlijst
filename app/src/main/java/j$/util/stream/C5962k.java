package j$.util.stream;

import com.google.android.gms.internal.ads.C1445Je;
import j$.util.C6045x;
import j$.util.C6046y;
import j$.util.Map;
import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5962k implements BinaryOperator, Function, BiConsumer, ObjDoubleConsumer, Supplier, LongFunction, IntFunction, DoubleBinaryOperator, DoubleFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37725a;

    public /* synthetic */ C5962k(int i8) {
        this.f37725a = i8;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f37725a) {
            case 2:
                break;
            case 4:
                break;
            case 23:
                break;
            case 24:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f37725a) {
            case 0:
                break;
            case 11:
                break;
            case 13:
                break;
            case 15:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function m26andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d8) {
        return Double.valueOf(d8);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        switch (this.f37725a) {
            case 10:
                return AbstractC6032y0.J(j8);
            case 11:
            default:
                return AbstractC6032y0.U(j8);
            case 12:
                return AbstractC6032y0.S(j8);
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Set set = Collectors.f37439a;
        return obj;
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d8, double d9) {
        return Math.min(d8, d9);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d8) {
        switch (this.f37725a) {
            case 3:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                Collectors.a(dArr, d8);
                dArr[3] = dArr[3] + d8;
                break;
            case 4:
            default:
                ((C6045x) obj).accept(d8);
                break;
            case 5:
                double[] dArr2 = (double[]) obj;
                Collectors.a(dArr2, d8);
                dArr2[2] = dArr2[2] + d8;
                break;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f37725a) {
            case 6:
                return new H();
            case 7:
                return new I();
            case 8:
                return new J();
            case 9:
                return new K();
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                return new double[4];
            case 18:
                return new C6045x();
            case 19:
                return new C6046y();
            case 20:
                return new j$.util.A();
            case C1445Je.zzm /* 21 */:
                return new HashMap();
            case 22:
                return new LinkedHashSet();
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f37725a) {
            case 2:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 4:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 23:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 24:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                ((C6045x) obj).b((C6045x) obj2);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i8) {
        return new Object[i8];
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f37725a) {
            case 0:
                Map map = (Map) obj;
                Set set = Collectors.f37439a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Object key = entry.getKey();
                    Object requireNonNull = Objects.requireNonNull(entry.getValue());
                    Object b8 = Map.EL.b(map, key, requireNonNull);
                    if (b8 != null) {
                        throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, b8, requireNonNull));
                    }
                }
                return map;
            case 11:
                return new S0((E0) obj, (E0) obj2);
            case 13:
                return new T0((G0) obj, (G0) obj2);
            case 15:
                return new U0((I0) obj, (I0) obj2);
            default:
                return new W0((K0) obj, (K0) obj2);
        }
    }
}
