package d6;

/* loaded from: classes2.dex */
final class e extends d {
    e(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d6.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + a() + ", " + get() + ")";
    }
}
