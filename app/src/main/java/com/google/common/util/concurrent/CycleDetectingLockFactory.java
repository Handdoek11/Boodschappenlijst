package com.google.common.util.concurrent;

import c4.r;
import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract class CycleDetectingLockFactory {

    public static final class PotentialDeadlockException extends a {

        /* renamed from: t, reason: collision with root package name */
        private final a f32691t;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable th = this.f32691t; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    private static class a extends IllegalStateException {

        /* renamed from: o, reason: collision with root package name */
        static final StackTraceElement[] f32692o = new StackTraceElement[0];

        /* renamed from: s, reason: collision with root package name */
        static final r f32693s = r.w(CycleDetectingLockFactory.class.getName(), a.class.getName(), b.class.getName());
    }

    private static class b {
    }
}
