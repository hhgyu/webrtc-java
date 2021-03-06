/*
 * Copyright 2019 Alex Andres
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

package dev.onvoid.webrtc.demo.javafx.factory;

import dev.onvoid.webrtc.media.video.VideoCaptureCapability;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class VideoCaptureCapabilityCellFactory implements Callback<ListView<VideoCaptureCapability>, ListCell<VideoCaptureCapability>> {

	@Override
	public ListCell<VideoCaptureCapability> call(ListView<VideoCaptureCapability> param) {
		return new VideoCaptureCapabilityListCell();
	}

}
