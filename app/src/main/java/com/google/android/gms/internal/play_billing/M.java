package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class M {

    /* renamed from: a, reason: collision with root package name */
    private static final Collector f29784a = Collector.CC.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.A
        @Override // java.util.function.Supplier
        public final Object get() {
            return new C5090c0(4);
        }
    }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.D
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((C5090c0) obj).e(obj2);
        }

        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.E
        public /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            C5090c0 c5090c0 = (C5090c0) obj;
            C5090c0 c5090c02 = (C5090c0) obj2;
            c5090c0.c(c5090c02.f29854a, c5090c02.f29855b);
            return c5090c0;
        }
    }, new Function() { // from class: com.google.android.gms.internal.play_billing.F
        public /* synthetic */ Function andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((C5090c0) obj).f();
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.CC.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.G
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C5150m0();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.H
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((C5150m0) obj).e(obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.I
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C5150m0 c5150m0 = (C5150m0) obj;
                C5150m0 c5150m02 = (C5150m0) obj2;
                c5150m0.c(c5150m02.f29854a, c5150m02.f29855b);
                return c5150m0;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.J
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C5150m0 c5150m0 = (C5150m0) obj;
                int i8 = c5150m0.f29855b;
                if (i8 == 0) {
                    return J0.f29771z;
                }
                if (i8 == 1) {
                    Object obj2 = c5150m0.f29854a[0];
                    Objects.requireNonNull(obj2);
                    return new M0(obj2);
                }
                AbstractC5156n0 s8 = AbstractC5156n0.s(i8, c5150m0.f29854a);
                c5150m0.f29855b = s8.size();
                c5150m0.f29856c = true;
                return s8;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
        Collector.CC.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.K
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C5138k0();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.L
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((C5138k0) obj).a((A0) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.B
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C5138k0 c5138k0 = (C5138k0) obj;
                c5138k0.b((C5138k0) obj2);
                return c5138k0;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.C
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C5138k0) obj).c();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector a() {
        return f29784a;
    }
}
