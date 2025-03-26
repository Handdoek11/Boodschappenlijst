package H2;

/* loaded from: classes.dex */
final class e extends Thread {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f2924o;

    e(g gVar, String str) {
        this.f2924o = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new u(null).n(this.f2924o);
    }
}
