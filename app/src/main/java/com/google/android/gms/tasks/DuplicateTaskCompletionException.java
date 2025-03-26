package com.google.android.gms.tasks;

import A3.AbstractC0376j;

/* loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(AbstractC0376j abstractC0376j) {
        if (!abstractC0376j.r()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception n8 = abstractC0376j.n();
        return new DuplicateTaskCompletionException("Complete with: ".concat(n8 != null ? "failure" : abstractC0376j.s() ? "result ".concat(String.valueOf(abstractC0376j.o())) : abstractC0376j.q() ? "cancellation" : "unknown issue"), n8);
    }
}
