package H2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f2921a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new b("ClientDefault"));

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f2922b = Executors.newSingleThreadExecutor(new b("ClientSingle"));
}
