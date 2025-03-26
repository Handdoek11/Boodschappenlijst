package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
final class j4 extends k4 implements Consumer {

    /* renamed from: e, reason: collision with root package name */
    final Predicate f37722e;

    /* renamed from: f, reason: collision with root package name */
    Object f37723f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f37724g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Spliterator spliterator, Predicate predicate, int i8) {
        super(spliterator);
        this.f37724g = i8;
        this.f37722e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Spliterator spliterator, j4 j4Var, int i8) {
        super(spliterator, j4Var);
        this.f37724g = i8;
        this.f37722e = j4Var.f37722e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37732d = (this.f37732d + 1) & 63;
        this.f37723f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean tryAdvance;
        boolean z7;
        switch (this.f37724g) {
            case 0:
                boolean z8 = this.f37731c;
                Spliterator spliterator = this.f37729a;
                if (z8) {
                    boolean z9 = false;
                    this.f37731c = false;
                    while (true) {
                        tryAdvance = spliterator.tryAdvance(this);
                        if (tryAdvance && b() && this.f37722e.test(this.f37723f)) {
                            z9 = true;
                        }
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    if (z9) {
                        this.f37730b.set(true);
                    }
                    consumer.accept(this.f37723f);
                    return tryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.f37731c && b() && this.f37729a.tryAdvance(this)) {
                    z7 = this.f37722e.test(this.f37723f);
                    if (z7) {
                        consumer.accept(this.f37723f);
                        return true;
                    }
                } else {
                    z7 = true;
                }
                this.f37731c = false;
                if (!z7) {
                    this.f37730b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f37724g) {
            case 1:
                if (!this.f37730b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // j$.util.stream.k4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f37724g) {
            case 0:
                return new j4(spliterator, this, 0);
            default:
                return new j4(spliterator, this, 1);
        }
    }
}
