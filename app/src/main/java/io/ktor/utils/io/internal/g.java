package io.ktor.utils.io.internal;

import J6.r;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final ByteBuffer f36909a;

    /* renamed from: b, reason: collision with root package name */
    private static final h f36910b;

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        r.d(allocate, "allocate(0)");
        f36909a = allocate;
        f36910b = new h(0);
    }

    public static final ByteBuffer a() {
        return f36909a;
    }

    public static final h b() {
        return f36910b;
    }
}
