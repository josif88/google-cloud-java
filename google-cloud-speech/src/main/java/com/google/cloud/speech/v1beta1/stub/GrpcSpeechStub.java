/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.speech.v1beta1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.speech.v1beta1.AsyncRecognizeMetadata;
import com.google.cloud.speech.v1beta1.AsyncRecognizeRequest;
import com.google.cloud.speech.v1beta1.AsyncRecognizeResponse;
import com.google.cloud.speech.v1beta1.SpeechSettings;
import com.google.cloud.speech.v1beta1.StreamingRecognizeRequest;
import com.google.cloud.speech.v1beta1.StreamingRecognizeResponse;
import com.google.cloud.speech.v1beta1.SyncRecognizeRequest;
import com.google.cloud.speech.v1beta1.SyncRecognizeResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Google Cloud Speech API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcSpeechStub extends SpeechStub {

  private static final MethodDescriptor<SyncRecognizeRequest, SyncRecognizeResponse>
      syncRecognizeMethodDescriptor =
          MethodDescriptor.<SyncRecognizeRequest, SyncRecognizeResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.speech.v1beta1.Speech/SyncRecognize")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SyncRecognizeRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SyncRecognizeResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<AsyncRecognizeRequest, Operation>
      asyncRecognizeMethodDescriptor =
          MethodDescriptor.<AsyncRecognizeRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.speech.v1beta1.Speech/AsyncRecognize")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AsyncRecognizeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<StreamingRecognizeRequest, StreamingRecognizeResponse>
      streamingRecognizeMethodDescriptor =
          MethodDescriptor.<StreamingRecognizeRequest, StreamingRecognizeResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName("google.cloud.speech.v1beta1.Speech/StreamingRecognize")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(StreamingRecognizeRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(StreamingRecognizeResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;

  private final UnaryCallable<SyncRecognizeRequest, SyncRecognizeResponse> syncRecognizeCallable;
  private final UnaryCallable<AsyncRecognizeRequest, Operation> asyncRecognizeCallable;
  private final OperationCallable<
          AsyncRecognizeRequest, AsyncRecognizeResponse, AsyncRecognizeMetadata>
      asyncRecognizeOperationCallable;
  private final BidiStreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse>
      streamingRecognizeCallable;

  public static final GrpcSpeechStub create(SpeechSettings settings) throws IOException {
    return new GrpcSpeechStub(settings, ClientContext.create(settings));
  }

  public static final GrpcSpeechStub create(ClientContext clientContext) throws IOException {
    return new GrpcSpeechStub(SpeechSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcSpeechStub, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcSpeechStub(SpeechSettings settings, ClientContext clientContext)
      throws IOException {
    this.operationsStub = GrpcOperationsStub.create(clientContext);

    GrpcCallSettings<SyncRecognizeRequest, SyncRecognizeResponse> syncRecognizeTransportSettings =
        GrpcCallSettings.<SyncRecognizeRequest, SyncRecognizeResponse>newBuilder()
            .setMethodDescriptor(syncRecognizeMethodDescriptor)
            .build();
    GrpcCallSettings<AsyncRecognizeRequest, Operation> asyncRecognizeTransportSettings =
        GrpcCallSettings.<AsyncRecognizeRequest, Operation>newBuilder()
            .setMethodDescriptor(asyncRecognizeMethodDescriptor)
            .build();
    GrpcCallSettings<StreamingRecognizeRequest, StreamingRecognizeResponse>
        streamingRecognizeTransportSettings =
            GrpcCallSettings.<StreamingRecognizeRequest, StreamingRecognizeResponse>newBuilder()
                .setMethodDescriptor(streamingRecognizeMethodDescriptor)
                .build();

    this.syncRecognizeCallable =
        GrpcCallableFactory.createUnaryCallable(
            syncRecognizeTransportSettings, settings.syncRecognizeSettings(), clientContext);
    this.asyncRecognizeCallable =
        GrpcCallableFactory.createUnaryCallable(
            asyncRecognizeTransportSettings, settings.asyncRecognizeSettings(), clientContext);
    this.asyncRecognizeOperationCallable =
        GrpcCallableFactory.createOperationCallable(
            asyncRecognizeTransportSettings,
            settings.asyncRecognizeOperationSettings(),
            clientContext,
            this.operationsStub);
    this.streamingRecognizeCallable =
        GrpcCallableFactory.createBidiStreamingCallable(
            streamingRecognizeTransportSettings,
            settings.streamingRecognizeSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<SyncRecognizeRequest, SyncRecognizeResponse> syncRecognizeCallable() {
    return syncRecognizeCallable;
  }

  public OperationCallable<AsyncRecognizeRequest, AsyncRecognizeResponse, AsyncRecognizeMetadata>
      asyncRecognizeOperationCallable() {
    return asyncRecognizeOperationCallable;
  }

  public UnaryCallable<AsyncRecognizeRequest, Operation> asyncRecognizeCallable() {
    return asyncRecognizeCallable;
  }

  public BidiStreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse>
      streamingRecognizeCallable() {
    return streamingRecognizeCallable;
  }

  @Override
  public final void close() throws Exception {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
