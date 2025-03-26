package j$.util.stream;

import com.google.android.gms.internal.ads.C1445Je;
import j$.util.C6046y;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements ToDoubleFunction, IntFunction, DoubleBinaryOperator, Supplier, Predicate, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37776a;

    public /* synthetic */ r(int i8) {
        this.f37776a = i8;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f37776a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f37776a) {
            case 14:
                break;
            case 19:
                break;
            case 23:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        return Long.valueOf(j8);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d8, double d9) {
        return Math.max(d8, d9);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i8, int i9) {
        switch (this.f37776a) {
            case 12:
                return Math.min(i8, i9);
            case 15:
                return i8 + i9;
            default:
                return Math.max(i8, i9);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j8, long j9) {
        switch (this.f37776a) {
            case C1445Je.zzm /* 21 */:
                return Math.min(j8, j9);
            default:
                return Math.max(j8, j9);
        }
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f37776a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f37776a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f37776a) {
            case 4:
                return ((j$.util.B) obj).c();
            case 5:
                return ((j$.util.C) obj).c();
            case 6:
                return ((j$.util.D) obj).c();
            default:
                return ((Optional) obj).b();
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f37776a) {
            case 3:
                return new double[3];
            case 17:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j8) {
        switch (this.f37776a) {
            case 20:
                ((j$.util.A) obj).accept(j8);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j8;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f37776a) {
            case 14:
                ((C6046y) obj).b((C6046y) obj2);
                break;
            case 19:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 23:
                ((j$.util.A) obj).b((j$.util.A) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i8) {
        switch (this.f37776a) {
            case 13:
                ((C6046y) obj).accept(i8);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i8;
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i8) {
        switch (this.f37776a) {
            case 1:
                return new Double[i8];
            case 8:
                return new Object[i8];
            case 9:
                return new Integer[i8];
            case 11:
                return Integer.valueOf(i8);
            default:
                return new Long[i8];
        }
    }
}
