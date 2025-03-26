package B1;

import androidx.work.WorkerParameters;
import t1.C6789j;

/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private C6789j f346o;

    /* renamed from: s, reason: collision with root package name */
    private String f347s;

    /* renamed from: t, reason: collision with root package name */
    private WorkerParameters.a f348t;

    public l(C6789j c6789j, String str, WorkerParameters.a aVar) {
        this.f346o = c6789j;
        this.f347s = str;
        this.f348t = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f346o.m().k(this.f347s, this.f348t);
    }
}
